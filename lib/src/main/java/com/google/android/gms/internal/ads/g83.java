package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class g83 implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f8640a;

    public g83(Pattern pattern) {
        Objects.requireNonNull(pattern);
        this.f8640a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.f8640a.matcher(str).matches();
    }
}
