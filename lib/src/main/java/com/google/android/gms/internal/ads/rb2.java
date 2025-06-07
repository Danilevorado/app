package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Debug;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class rb2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f14727a;

    public rb2(bb3 bb3Var) {
        this.f14727a = bb3Var;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f14727a.g(new Callable() { // from class: com.google.android.gms.internal.ads.qb2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bundle bundle = new Bundle();
                if (((Boolean) k3.w.c().b(ir.J)).booleanValue()) {
                    Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                    Debug.getMemoryInfo(memoryInfo);
                    bundle.putString("debug_info_dalvik_private_dirty", Integer.toString(memoryInfo.dalvikPrivateDirty));
                    bundle.putString("debug_info_dalvik_pss", Integer.toString(memoryInfo.dalvikPss));
                    bundle.putString("debug_info_dalvik_shared_dirty", Integer.toString(memoryInfo.dalvikSharedDirty));
                    bundle.putString("debug_info_native_private_dirty", Integer.toString(memoryInfo.nativePrivateDirty));
                    bundle.putString("debug_info_native_pss", Integer.toString(memoryInfo.nativePss));
                    bundle.putString("debug_info_native_shared_dirty", Integer.toString(memoryInfo.nativeSharedDirty));
                    bundle.putString("debug_info_other_private_dirty", Integer.toString(memoryInfo.otherPrivateDirty));
                    bundle.putString("debug_info_other_pss", Integer.toString(memoryInfo.otherPss));
                    bundle.putString("debug_info_other_shared_dirty", Integer.toString(memoryInfo.otherSharedDirty));
                }
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free", runtime.freeMemory());
                bundle.putLong("runtime_max", runtime.maxMemory());
                bundle.putLong("runtime_total", runtime.totalMemory());
                bundle.putInt("web_view_count", j3.t.q().a());
                return new sb2(bundle);
            }
        });
    }
}
