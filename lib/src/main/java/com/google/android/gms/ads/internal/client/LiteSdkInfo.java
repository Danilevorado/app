package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.l30;
import com.google.android.gms.internal.ads.o30;
import k3.c3;
import k3.h1;

/* loaded from: classes.dex */
public class LiteSdkInfo extends h1 {
    public LiteSdkInfo(Context context) {
    }

    @Override // k3.i1
    public o30 getAdapterCreator() {
        return new l30();
    }

    @Override // k3.i1
    public c3 getLiteSdkVersion() {
        return new c3(ModuleDescriptor.MODULE_VERSION, 231004000, "22.1.0");
    }
}
