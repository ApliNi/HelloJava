package aplini.test.Util;

import aplini.test.Test;

public class Util {

    // 获取配置, 通过配置路径
    public static String fromConfig(String path) {
        return Test.getInstance().getConfig().getString(path);
    }
    public static Boolean fromConfigBoolean(String path) {
        return Test.getInstance().getConfig().getBoolean(path);
    }

    // 重载配置文件
    public static void reloadConfig() {
        Test.getInstance().reloadConfig();
    }

}
