/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CacheConvert;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dann-dev
 */
public class CurrencyRateCache {
    private Map< String, Double> ratesCache;
    public CurrencyRateCache(){
        ratesCache = new HashMap<>();
        
    }
    public void updateRates(Map<String, Double> rates){
        ratesCache.clear();
        ratesCache.putAll(rates);
    }
    public Double getRate(String currencyCode){
        return ratesCache.get(currencyCode);
    }
}
