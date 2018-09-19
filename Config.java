
/**
 * Created by ankitarora.
 */

public class Config {

    private static final String BROWSER = System.getProperty("browser", Constants.CHROME_BROWSER);
    private static final String IS_REMOTING = System.getProperty("isRemoting", "false");
    private static final String IS_MOBILE = System.getProperty("isMobile", "false");
    private static final String WINDOW_SIZE = System.getProperty("windowSize", "maximized");
    private static final String HTTP = "http://";
    private static final String HTTPS = "https://";
    private static String BASE_URL = System.getProperty("baseUrl", "localhost");


    public static String getBaseUrl() {
        if (BASE_URL.toLowerCase().contains(HTTPS)) {
            return BASE_URL;
        }
        return HTTP + BASE_URL;
    }

    public static void setBaseUrl(String url) {
        BASE_URL = url;
    }

    /**
     * Gets baseUrl with protocol prepended if valid one passed in, otherwise baseUrl returned
     *
     * @param protocol The protocol (http/https) to prepend to baseUrl
     * @return String
     */
    public static String getBaseUrl(String protocol) {
        if (protocol.equalsIgnoreCase(HTTP)) {
            return HTTP + BASE_URL;
        } else if (protocol.equalsIgnoreCase(HTTPS)) {
            return HTTPS + BASE_URL;
        } else {
            return BASE_URL;
        }
    }


    private static Boolean getIsMobile() {
        return Boolean.parseBoolean(IS_MOBILE);
    }

    public static String getSiteRegion() {
        return SITE_REGION;
    }

    public static String getBrowser() {
        return BROWSER;
    }

    public static String getDataSet() {
        return DATA_SET;
    }

    public static Boolean getIsRemoting() {
        return Boolean.parseBoolean(IS_REMOTING);
    }

    public static String getWindowSize() {
        return WINDOW_SIZE;
    }


    /**
     * Checks if current browser is Safari
     *
     * @return Boolean
     */
    public static boolean isSafari() {
        return getBrowser().equalsIgnoreCase(Constants.SAFARI_BROWSER);
    }

    /**
     * Checks if current browser is Chrome
     *
     * @return Boolean
     */
    public static boolean isChrome() {
        return getBrowser().equalsIgnoreCase(Constants.CHROME_BROWSER);
    }

    /**
     * Checks if current browser is Chrome with mobile emulation
     *
     * @return Boolean
     */
    public static boolean isChromeMobileEmulation() {
        return getBrowser().equalsIgnoreCase(Constants.CHROME_MOBILE_EMULATION_BROWSER);
    }

    /**
     * Checks if current browser is Fireofox
     *
     * @return Boolean
     */
    public static boolean isFirefox() {
        return getBrowser().equalsIgnoreCase(Constants.FIREFOX_BROWSER);
    }

    /**
     * Checks if current browser is Internet Explorer
     *
     * @return Boolean
     */
    public static boolean isIe() {
        return getBrowser().equalsIgnoreCase(Constants.IE_BROWSER);
    }




}