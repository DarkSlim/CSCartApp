package gr.plushost.prototypeapp.transformers;

/**
 * Created by daimajia on 14-5-29.
 */
import android.view.View;

import gr.plushost.prototypeapp.view.ViewHelper;


public class AccordionTransformer extends BaseTransformer {

    @Override
    protected void onTransform(View view, float position) {
        ViewHelper.setPivotX(view, position < 0 ? 0 : view.getWidth());
        ViewHelper.setScaleX(view,position < 0 ? 1f + position : 1f - position);
    }

}