package isp_settings_second;

import java.util.Map;

interface SettingsWriteRepository {

    void write(Map<String, String> settings);

}
