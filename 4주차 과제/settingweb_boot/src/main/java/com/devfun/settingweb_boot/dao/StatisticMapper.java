package com.devfun.settingweb_boot.dao;
import java.util.HashMap;
 
import com.devfun.settingweb_boot.dto.StatisticDto;
 
public interface  StatisticMapper {
    public HashMap<String, Object> selectMonthLogin(String month);
    public HashMap<String, Object> selectDateLogin(String date);
    public HashMap<String, Object> selectDailyLogin();
    public HashMap<String, Object> selectMonthOrgLogin(String org);
}