package koti.mvp.Presenter;

import koti.mvp.View.Basepresenter;
import koti.mvp.View.Mainview;

/**
 * Created by User on 11/22/2016.
 */

public interface MainMvpPresenter extends Basepresenter<Mainview> {
    void loadData();
}
