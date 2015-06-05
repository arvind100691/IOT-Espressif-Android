package com.espressif.iot.log;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;


// it is generated by python
public class InitLogger {
    public static void init(){
        //######content######
        ConfigureLog4J.configure();
        Logger.getLogger(com.espressif.iot.base.net.wifi.WifiAdmin.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.base.net.rest.EspHttpUtil.class).setLevel(Level.DEBUG);
        Logger.getLogger(com.espressif.iot.ui.device.DeviceActivityAbs.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.base.net.rest.mesh.EspSocketUtil.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.base.net.mdns.MdnsDiscoverUtil.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.base.net.rest.mesh.EspMeshDiscoverUtil.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.base.net.rest.mesh.EspSocketReaderUtil.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.base.net.rest.mesh.EspMeshNetUtil.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.base.net.rest.mesh.EspPureSocketServer.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.base.net.rest.mesh.EspSocketClient.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.base.net.longsocket.EspLongSocket.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.base.net.udp.UdpBroadcastUtil.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.base.threadpool.CachedThreadPool.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.log.InitLogger.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.action.softap_sta_support.SSSActionDeviceUpgradeLocal.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.log.ReadLogTask.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.log.LogConfigurator.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.model.help.statemachine.EspHelpStateMachine.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.base.net.rest.EspHttpDownloadUtil.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.action.device.New.EspActionDeviceNewGetInfoLocal.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.action.device.New.EspActionDeviceNewConfigureLocal.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.action.device.mesh.EspActionMeshDeviceConfigureLocal.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.action.device.common.EspActionDeviceSynchronizeInterentDiscoverLocal.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.action.device.longsocket.EspDeviceLongSocketLight.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.action.device.common.EspActionDeviceReconnectLocal.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.action.user.EspActionUserLoginDB.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.action.device.sensor.EspActionSensorGetStatusListInternetDB.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.action.user.EspActionUserDevicesUpdated.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.action.user.EspActionUserRegisterInternet.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.action.user.EspActionUserLoginInternet.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.model.user.EspUser.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.model.device.statemachine.EspDeviceStateMachine.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.model.device.upgrade.EspDeviceCheckCompatibility.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.model.device.EspDeviceNew.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.model.device.upgrade.EspDeviceDoUpgradeOnline.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.model.device.upgrade.EspDeviceDoUpgradeLocal.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.model.device.cache.EspDeviceCache.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.db.IOTDownloadIdValueDBManager.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.model.device.cache.EspDeviceCacheHandler.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.db.IOTUserDBManager.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.db.IOTGenericDataDBManager.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.db.IOTGenericDataDirectoryDBManager.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.db.IOTApDBManager.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.db.IOTDeviceDBManager.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.humiture.EspCommandHumitureGetStatusListInternet.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.light.EspCommandLightPostStatusLocal.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.light.EspCommandLightGetStatusInternet.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.light.EspCommandLightPostStatusInternet.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.light.EspCommandLightGetStatusLocal.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.plug.EspCommandPlugGetStatusLocal.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.humiture.EspCommandHumitureGetStatusInternet.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.mesh.EspCommandMeshConfigureLocal.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.plug.EspCommandPlugGetStatusInternet.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.plug.EspCommandPlugPostStatusInternet.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.plug.EspCommandPlugPostStatusLocal.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.user.EspCommandUserRegisterInternet.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.voltage.EspCommandVoltageGetStatusInternet.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.user.EspCommandUserLoginInternet.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.user.EspCommandUserLoginDB.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.sensor.EspCommandSensorGetStatusListInternet.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.voltage.EspCommandVoltageGetStatusListInternet.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.New.EspCommandDeviceNewConfigureLocal.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.sensor.EspCommandSensorGetStatusInternet.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.common.EspCommandDeviceDeleteInternet.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.New.EspCommandDeviceNewActivateInternet.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.New.EspCommandDeviceNewGetInfoLocal.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.remote.EspCommandRemotePostStatusInternet.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.common.EspCommandDeviceDiscoverLocal.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.common.EspCommandDeviceReconnectLocal.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.common.EspCommandDeviceSynchronizeInternet.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.common.EspCommandDeviceTimerInternet.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.common.EspCommandDeviceRenameInternet.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.flammable.EspCommandFlammableGetStatusListInternet.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.remote.EspCommandRemoteGetStatusLocal.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.remote.EspCommandRemotePostStatusLocal.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.remote.EspCommandRemoteGetStatusInternet.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.ui.settings.SettingsFragment.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.command.device.flammable.EspCommandFlammableGetStatusInternet.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.base.upgrade.apk.UpgradeManagerApkOnline.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.ui.main.RegisterActivity.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.ui.softap_sta_support.SSSFragmentDevices.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.ui.main.LoginActivity.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.ui.main.EspUIActivity.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.ui.main.WelcomeActivity.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.ui.device.timer.DeviceTimersActivity.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.ui.softap_sta_support.SSSFragmentConfigure.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.ui.help.HelpEspUIActivity.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.ui.configure.DeviceConfigureActivity.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.base.time.EspTimeManager.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.ui.configure.WifiConfigureActivity.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.ui.configure.DeviceConfigureProgressDialog.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.action.device.New.EspActionDeviceNewActivateInternet.class).setLevel(Level.OFF);
        Logger.getLogger(com.espressif.iot.base.net.rest.MeshEspHttpUtil.class).setLevel(Level.OFF);
    }
}