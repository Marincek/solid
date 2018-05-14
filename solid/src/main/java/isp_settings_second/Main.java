package isp_settings_second;

import java.util.Map;

class Main {

    public static void main(String[] args) {
        SettingsReadWriteRepository appSettingsRepository = new ApplicationSettingsRepository();
        SettingsReadRepository sysSettingsRepository = new SystemSettingsRepository();

        System.out.println("Settings : ");
        System.out.println(appSettingsRepository.read());
        System.out.println(sysSettingsRepository.read());

        Map<String, String> tempAppSettings = appSettingsRepository.read();
        tempAppSettings.put("app_email", "contact@musala.com");
        appSettingsRepository.write(tempAppSettings);

        Map<String, String> tempSysSettings = sysSettingsRepository.read();
        tempSysSettings.put("ip", "127.0.0.1");
//        sysSettingsRepository.write(tempSettings);

        System.out.println("\n");

    }
}
