package com.demo.random;

/**
 * 深圳市卯丁技术有限公司
 * 日期: 2018/9/29
 * 类名: com.demo.random.RandomServerPortPropertySource
 * 作者: 张成亮
 * 描述:
 **/
import org.springframework.core.env.PropertySource;
import org.springframework.util.StringUtils;

public class RandomServerPortPropertySource extends PropertySource<RandomServerPort> {

    /**
     * Name of the random {@link PropertySource}.
     */
    public static final String RANDOM_SERVER_PORT_PROPERTY_SOURCE_NAME = "randomServerPort";

    private static final String PREFIX = "randomServerPort.";

    public RandomServerPortPropertySource(String name) {
        super(name, new RandomServerPort());
    }

    public RandomServerPortPropertySource() {
        this(RANDOM_SERVER_PORT_PROPERTY_SOURCE_NAME);
    }

    public RandomServerPortPropertySource(String name, RandomServerPort source) {
        super(name, source);
    }

    @Override
    public Object getProperty(String name) {
        if (!name.startsWith(PREFIX)) {
            return null;
        }
        return getRandomServerPortValue(name.substring(PREFIX.length()));
    }

    private Object getRandomServerPortValue(String type) {
        String range = getRange(type, "value");
        if (range != null) {
            return getNextValueInRange(range);
        }
        return null;
    }

    private String getRange(String type, String prefix) {
        if (type.startsWith(prefix)) {
            int startIndex = prefix.length() + 1;
            if (type.length() > startIndex) {
                return type.substring(startIndex, type.length() - 1);
            }
        }
        return null;
    }

    private int getNextValueInRange(String range) {
        String[] tokens = StringUtils.commaDelimitedListToStringArray(range);
        int start = Integer.parseInt(tokens[0]);
        if (tokens.length == 1) {
            return getSource().nextValue(start);
        }
        return getSource().nextValue(start, Integer.parseInt(tokens[1]));
    }
}
