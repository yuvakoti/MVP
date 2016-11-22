package koti.mvp.Presenter;

import koti.mvp.View.Mainview;

/**
 * Created by User on 11/22/2016.
 */

public class MainPresenter implements MainMvpPresenter {
    Mainview mainview;

    @Override
    public void loadData() {
       mainview.showProgress();
        try {
            String fakeData = "Fireflies";
            mainview.showText(fakeData);
        } catch (Exception e) {
            mainview.showError(e.getMessage());
        }
        mainview.hideProgress();
    }

    @Override
    public void attachedView(Mainview view) {
        this.mainview = view;

    }

    @Override
    public void detachView() {
      mainview =null;
    }
}
