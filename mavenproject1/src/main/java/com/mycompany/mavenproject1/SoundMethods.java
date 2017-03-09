/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import world.drj.drjclass.sound.Sound;

/**
 *
 * @author Edison.Morrow
 */
public class SoundMethods extends Sound {
    private final List<Integer> samples = new ArrayList();

    public SoundMethods() {
    }

    @Override
    public int limitAmplitude(int i) {
        Iterator itr=samples.iterator();
        while(itr.hasNext()){
            if(itr.next())
        }
    }

    @Override
    public void trimSilenceFromBeginning() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
