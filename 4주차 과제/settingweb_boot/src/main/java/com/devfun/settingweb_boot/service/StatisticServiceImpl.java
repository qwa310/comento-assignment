package com.devfun.settingweb_boot.service;
 
 
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.devfun.settingweb_boot.dao.StatisticMapper;
 
@Service
public class StatisticServiceImpl implements StatisticService {
    
    
    @Autowired
    private StatisticMapper uMapper;
    
    @Override
    public HashMap<String, Object> monthloginNum (String month) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectMonthLogin(month);
            retVal.put("month", month);
            retVal.put("is_success", true);
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("month", month);
            retVal.put("is_success", false);
        }
        
        return retVal;
    }
    
    @Override
    public HashMap<String, Object> dateloginNum (String date) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectDateLogin(date);
            retVal.put("date", date);
            retVal.put("is_success", true);
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("date", date);
            retVal.put("is_success", false);
        }
        
        return retVal;
    }
    
    @Override
    public HashMap<String, Object> dailyloginNum() {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectDailyLogin();
            retVal.put("is_success", true);
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("is_success", false);
        }
        
        return retVal;
    }
    
    @Override
    public HashMap<String, Object> monthorgloginNum (String month) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectMonthOrgLogin(month);
            retVal.put("month", month);
            retVal.put("is_success", true);
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("month", month);
            retVal.put("is_success", false);
        }
        
        return retVal;
    }
 
}