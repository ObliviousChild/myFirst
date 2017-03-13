/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pplvalentine;

/**
 *
 * @author Mac
 */
public class LuxuryGift 
{
    
    private final int price;
    private final int value;
    private final int luxrate;
    private final int diff;
    
    LuxuryGift(int p, int v, int l, int d)
    {
        price=p;
        value=v;
        luxrate=l;
        diff=d;
    }
    
    int getPrice()
    {
        return price;
    }
    
    int getValue()
    {
        return value;
    }
}
