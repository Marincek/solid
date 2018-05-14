package isp_settings_first;

import java.util.HashMap;
import java.util.Map;

class ApplicationSettingsRepository implements SettingsRepository {

    private Map<String, String> applicationSettings = new HashMap<>();

    public ApplicationSettingsRepository() {
        applicationSettings.put("app_email", "info@musala.com");
        applicationSettings.put("company_address", "Soravia 5th floor");
    }

    @Override
    public Map<String, String> read() {
        return new HashMap(applicationSettings);
    }

    @Override
    public void write(Map<String, String> settings) {
        applicationSettings = settings;
    }

}
