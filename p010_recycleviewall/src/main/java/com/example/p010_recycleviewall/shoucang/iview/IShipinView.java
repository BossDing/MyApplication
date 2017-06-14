package com.example.p010_recycleviewall.shoucang.iview;


import com.example.p010_recycleviewall.shoucang.domain.ShoucangShipinIndexBean;
import com.example.p010_recycleviewall.tablayout.fragmentframelayout.mvp.IView;

public interface IShipinView extends IView {
    void onGetShipinSuccess(ShoucangShipinIndexBean data);

    void onGetShipinNotok(boolean isok);

    void onGetShipinEmpty(String msg);

    void onGetShipinFailed(String msg);
}