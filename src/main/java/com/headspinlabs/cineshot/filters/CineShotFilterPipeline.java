package com.headspinlabs.cineshot.filters;

import com.headspinlabs.cineshot.CineShotFrame;

public class CineShotFilterPipeline extends CineShotFilterBase {

    private CineShotFilter filters[];

    public CineShotFilterPipeline(CineShotFilter filters[]) {
        this.filters = filters;
    }

    public void frame(CineShotFrame frame) {
        for (CineShotFilter filter : filters) {
            filter.frame(frame);
        }
    }
}

