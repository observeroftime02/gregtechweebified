package com.github.observeroftime.gregtechweebified;

import gregtech.api.util.GT_Log;

public class TestLog implements Runnable {
    @Override
    public void run() {
        GT_Log.out.println("TESLOG OUTPUT CALLED");
    }
}
