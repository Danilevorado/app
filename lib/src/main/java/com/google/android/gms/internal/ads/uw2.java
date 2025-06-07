package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class uw2 extends pw2 {
    public uw2(jw2 jw2Var, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(jw2Var, hashSet, jSONObject, j10);
    }

    private final void c(String str) {
        mv2 mv2VarA = mv2.a();
        if (mv2VarA != null) {
            for (cv2 cv2Var : mv2VarA.c()) {
                if (this.f14070c.contains(cv2Var.h())) {
                    cv2Var.g().d(str, this.f14072e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.qw2
    /* renamed from: a */
    public final void onPostExecute(String str) {
        c(str);
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f14071d.toString();
    }

    @Override // com.google.android.gms.internal.ads.qw2, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        c(str);
        super.onPostExecute(str);
    }
}
