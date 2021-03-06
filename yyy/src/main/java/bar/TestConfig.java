package bar;

/**
 * @author liuzh
 */
public interface TestConfig {
    /**
     * 测试文件生成的目录
     */
    String EXPORT_PATH = "/tmp/echarts/";

    /**
     * 通过view控制所有测试是否打开浏览器
     */
    Boolean VIEW = true;
}
