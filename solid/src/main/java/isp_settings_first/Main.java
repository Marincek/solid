package isp_settings_first;

import java.util.Map;

class Main {

    public static void main(String[] args) {

        SettingsRepository appSettingsRepository = new ApplicationSettingsRepository();
        SettingsRepository sysSettingsRepository = new SystemSettingsRepository();

        System.out.println("Settings : ");
        System.out.println(appSettingsRepository.read());
        System.out.println(sysSettingsRepository.read());

        Map<String, String> tempAppSettings = appSettingsRepository.read();
        tempAppSettings.put("app_email", "contact@musala.com");
        appSettingsRepository.write(tempAppSettings);

        Map<String, String> tempSysSettings = sysSettingsRepository.read();
        tempSysSettings.put("ip", "127.0.0.1");
        sysSettingsRepository.write(tempSysSettings);

        System.out.println("\nNew Settings : ");
        System.out.println(appSettingsRepository.read());
        System.out.println(sysSettingsRepository.read());

    }
}
