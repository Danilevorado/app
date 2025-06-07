package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class b implements d {

    /* renamed from: m, reason: collision with root package name */
    private final String f5426m;

    /* renamed from: n, reason: collision with root package name */
    private final AssetManager f5427n;

    /* renamed from: o, reason: collision with root package name */
    private Object f5428o;

    public b(AssetManager assetManager, String str) {
        this.f5427n = assetManager;
        this.f5426m = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        Object obj = this.f5428o;
        if (obj == null) {
            return;
        }
        try {
            c(obj);
        } catch (IOException unused) {
        }
    }

    protected abstract void c(Object obj);

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    protected abstract Object d(AssetManager assetManager, String str);

    @Override // com.bumptech.glide.load.data.d
    public r1.a e() {
        return r1.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void f(com.bumptech.glide.g gVar, d.a aVar) {
        try {
            Object objD = d(this.f5427n, this.f5426m);
            this.f5428o = objD;
            aVar.d(objD);
        } catch (IOException e5) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e5);
            }
            aVar.c(e5);
        }
    }
}
