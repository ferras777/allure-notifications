package guru.qa.allure.notifications.config.helpers;

import guru.qa.allure.notifications.exceptions.ArgumentNotProvidedException;
import guru.qa.allure.notifications.config.BuildConfig;

import java.util.Optional;

public class Build {

    public static String projectName() {
        return Optional
                .ofNullable(BuildConfig.config.getString("projectName"))
                .orElseThrow(() ->
                        new ArgumentNotProvidedException("projectName"));
    }

    /**
     * <p>Получает значение по ключу <code>env</code></p>
     * @return значение, если имеется
     * @throws ArgumentNotProvidedException если параметр не указан или null
     */
    public static String env() {
        return Optional
                .ofNullable(BuildConfig.config.getString("env"))
                .orElseThrow(() ->
                        new ArgumentNotProvidedException("env"));
    }

    /**
     * <p>Получает значение по ключу <code>reportLink</code></p>
     * @return значение, если имеется
     * @throws ArgumentNotProvidedException если параметр не указан или null
     */
    public static String reportLink() {
        String link = Optional
                .ofNullable(BuildConfig.config.getString("reportLink"))
                .orElseThrow(() ->
                        new ArgumentNotProvidedException("reportLink"));

        return link + Base.allureLinkPath();
    }

    /**
     * <p>Получает значение по ключу <code>comm</code></p>
     * @return значение, если имеется
     * @throws ArgumentNotProvidedException если параметр не указан или null
     */
    public static String comment() {
        return Optional
                .ofNullable(BuildConfig.config.getString("comm"))
                .orElseThrow(() ->
                        new ArgumentNotProvidedException("comm"));
    }
}
