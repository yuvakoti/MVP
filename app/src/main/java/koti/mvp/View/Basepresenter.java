package koti.mvp.View;

/**
 * Created by User on 11/22/2016.
 */

public interface Basepresenter<V> {

    void attachedView (V view);
    void  detachView();
}
