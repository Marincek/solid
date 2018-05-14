package isp_settings_second;

import java.util.HashMap;
import java.util.Map;

class SystemSettingsRepository implements SettingsReadRepository {

    private Map<String, String> systemSettings = new HashMap<>();

    public SystemSettingsRepository() {
        systemSettings.put("os", "windows");
        systemSettings.put("ram", "8gb");
        systemSettings.put("ip", "192.168.1.1");
    }

    @Override
    public Map<String, String> read() {
        return new HashMap(systemSettings);
    }

}
