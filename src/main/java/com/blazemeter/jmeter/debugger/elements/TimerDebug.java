package com.blazemeter.jmeter.debugger.elements;

import com.blazemeter.jmeter.debugger.engine.StepTrigger;
import org.apache.jmeter.timers.Timer;

public class TimerDebug extends AbstractDebugElement<Timer> implements Timer {
    public TimerDebug(Timer te, StepTrigger hook) {
        super(te, hook);
    }

    @Override
    public long delay() {
        hook.notify(this);
        return parent.delay();
    }
}