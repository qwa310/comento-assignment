package com.devfun.settingweb_boot.service;
 
import java.util.HashMap;
 
public interface StatisticService {
    public HashMap<String,Object> monthloginNum (String month);
    public HashMap<String,Object> dateloginNum (String date);
    public HashMap<String,Object> dailyloginNum ();
    public HashMap<String,Object> monthorgloginNum (String month);
}