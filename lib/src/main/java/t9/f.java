package t9;

import android.content.SharedPreferences;
import java.util.Set;

/* loaded from: classes2.dex */
public interface f extends SharedPreferences.Editor {
    @Override // android.content.SharedPreferences.Editor
    f putBoolean(String str, boolean z10);

    @Override // android.content.SharedPreferences.Editor
    f putFloat(String str, float f5);

    @Override // android.content.SharedPreferences.Editor
    f putInt(String str, int i10);

    @Override // android.content.SharedPreferences.Editor
    f putLong(String str, long j10);

    @Override // android.content.SharedPreferences.Editor
    f putString(String str, String str2);

    @Override // android.content.SharedPreferences.Editor
    f putStringSet(String str, Set set);
}
