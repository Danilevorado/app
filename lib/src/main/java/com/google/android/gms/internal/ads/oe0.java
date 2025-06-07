package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class oe0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f13172a = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new ne0("ClientDefault"));

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorService f13173b = Executors.newSingleThreadExecutor(new ne0("ClientSingle"));
}
