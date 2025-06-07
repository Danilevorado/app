package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class vw2 extends pw2 {
    public vw2(jw2 jw2Var, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(jw2Var, hashSet, jSONObject, j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.qw2
    /* renamed from: a */
    public final void onPostExecute(String str) {
        mv2 mv2VarA;
        if (!TextUtils.isEmpty(str) && (mv2VarA = mv2.a()) != null) {
            for (cv2 cv2Var : mv2VarA.c()) {
                if (this.f14070c.contains(cv2Var.h())) {
                    cv2Var.g().e(str, this.f14072e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (dw2.g(this.f14071d, this.f14522b.a())) {
            return null;
        }
        this.f14522b.e(this.f14071d);
        return this.f14071d.toString();
    }

    @Override // com.google.android.gms.internal.ads.qw2, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
