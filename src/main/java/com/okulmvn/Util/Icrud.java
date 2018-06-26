/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okulmvn.Util;

import java.util.List;

/**
 *
 * @author cesur
 */
public interface Icrud<T> {
    
    public boolean kaydet(T t);
    public boolean duzenle(T t);
   
     public List<T> listele(T t);
     public List<T> ara(T t);
     public T bul(int id, T t);
}
