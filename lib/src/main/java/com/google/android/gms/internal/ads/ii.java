package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class ii extends ui {
    public ii(dh dhVar, String str, String str2, xc xcVar, int i10, int i11) {
        super(dhVar, "+Lr3mNK9DiW6aOFsrAhw/ufFUWF1jNkYNrUOryhl9dmdhxcK7UxVybCFjyLF5UVn", "z6qQV45Nmnz8yfEHycE7xvBh5frOehaJSTK9o+9gqcg=", xcVar, i10, 73);
    }

    @Override // com.google.android.gms.internal.ads.ui
    protected final void a() {
        try {
            int i10 = 1;
            boolean zBooleanValue = ((Boolean) this.f16346f.invoke(null, this.f16342b.b())).booleanValue();
            xc xcVar = this.f16345e;
            if (true == zBooleanValue) {
                i10 = 2;
            }
            xcVar.b0(i10);
        } catch (InvocationTargetException unused) {
            this.f16345e.b0(3);
        }
    }
}
