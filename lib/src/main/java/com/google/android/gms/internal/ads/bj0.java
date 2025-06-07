package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class bj0 extends yi0 {

    /* renamed from: r, reason: collision with root package name */
    private static final Set f6500r = Collections.synchronizedSet(new HashSet());

    /* renamed from: s, reason: collision with root package name */
    private static final DecimalFormat f6501s = new DecimalFormat("#,###");

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f6502t = 0;

    /* renamed from: p, reason: collision with root package name */
    private File f6503p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f6504q;

    public bj0(lh0 lh0Var) {
        super(lh0Var);
        File cacheDir = this.f18052m.getCacheDir();
        if (cacheDir == null) {
            ze0.g("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.f6503p = file;
        if (!file.isDirectory() && !this.f6503p.mkdirs()) {
            ze0.g("Could not create preload cache directory at ".concat(String.valueOf(this.f6503p.getAbsolutePath())));
            this.f6503p = null;
        } else {
            if (this.f6503p.setReadable(true, false) && this.f6503p.setExecutable(true, false)) {
                return;
            }
            ze0.g("Could not set cache file permissions at ".concat(String.valueOf(this.f6503p.getAbsolutePath())));
            this.f6503p = null;
        }
    }

    private final File z(File file) {
        return new File(this.f6503p, String.valueOf(file.getName()).concat(".done"));
    }

    @Override // com.google.android.gms.internal.ads.yi0
    public final void j() {
        this.f6504q = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0343, code lost:
    
        r26 = r4;
        r24 = r14;
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0349, code lost:
    
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0351, code lost:
    
        if (com.google.android.gms.internal.ads.ze0.j(3) == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0353, code lost:
    
        com.google.android.gms.internal.ads.ze0.b("Preloaded " + com.google.android.gms.internal.ads.bj0.f6501s.format(r13) + " bytes from " + r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0376, code lost:
    
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x037f, code lost:
    
        if (r0.isFile() == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0381, code lost:
    
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0389, code lost:
    
        r0.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x040b  */
    @Override // com.google.android.gms.internal.ads.yi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(final java.lang.String r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bj0.w(java.lang.String):boolean");
    }
}
