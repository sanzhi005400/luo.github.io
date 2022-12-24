package com.hspedu.main_;

/**
 * @author: 罗仕杰
 * @date: 2022/12/12 20:49
 * @description:
 */
public interface Biology{
    public void breath();}
interface Animal extends Biology{
    public void move();
    public void eat();}
interface Mankind extends Animal{
    public void study();
    public void think();}

