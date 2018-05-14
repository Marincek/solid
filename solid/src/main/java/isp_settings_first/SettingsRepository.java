package isp_settings_first;

import java.util.Map;

interface SettingsRepository {

    Map<String, String> read();

    void write(Map<String, String> settings);

}
