package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes.dex */
public final class uo2 {

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f16417a;

    public uo2() {
        Pattern patternCompile;
        try {
            patternCompile = Pattern.compile((String) k3.w.c().b(ir.A6));
        } catch (PatternSyntaxException unused) {
            patternCompile = null;
        }
        this.f16417a = patternCompile;
    }

    public final String a(String str) {
        Pattern pattern = this.f16417a;
        if (pattern != null && str != null) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}
