package com.onesignal;

/* loaded from: classes.dex */
public abstract class j implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        Thread.currentThread().setPriority(10);
    }
}
