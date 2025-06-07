package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class l implements d {

    /* renamed from: m, reason: collision with root package name */
    private final Uri f5450m;

    /* renamed from: n, reason: collision with root package name */
    private final ContentResolver f5451n;

    /* renamed from: o, reason: collision with root package name */
    private Object f5452o;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f5451n = contentResolver;
        this.f5450m = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        Object obj = this.f5452o;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    protected abstract void c(Object obj);

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    protected abstract Object d(Uri uri, ContentResolver contentResolver);

    @Override // com.bumptech.glide.load.data.d
    public r1.a e() {
        return r1.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void f(com.bumptech.glide.g gVar, d.a aVar) {
        try {
            Object objD = d(this.f5450m, this.f5451n);
            this.f5452o = objD;
            aVar.d(objD);
        } catch (FileNotFoundException e5) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e5);
            }
            aVar.c(e5);
        }
    }
}
