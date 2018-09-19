

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

/**
 * Created by ankitarora.
 */
public class ScenarioData {

    private String sessionId;
    private static final String SESSION_COOKIE_NAME = "JSESSIONID";


    public ScenarioData() {
    }

    /**
     * Gets the id of the current session
     *
     * @return sessionId String of current session id
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * Sets Session Id
     *
     * @param driver WebDriver instance
     */
    public void setSessionId(WebDriver driver) {
        //TODO: retest when new safaridriver is stable
        if (Config.getBrowser().equalsIgnoreCase(Constants.SAFARI_BROWSER) ||
                Config.isMobile()) {
            this.sessionId = "SKIPPED_FOR_SAFARI_AND_MOBILE";
        } else {
            Cookie cookie = driver.manage().getCookieNamed(SESSION_COOKIE_NAME);
            try {
                this.sessionId = cookie.getValue();
            } catch (NullPointerException ex) {
            }
        }
    }

}