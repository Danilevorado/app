package com.onesignal;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
class u2 extends t2 {

    /* renamed from: f, reason: collision with root package name */
    static final HashSet f22470f = new HashSet(Arrays.asList("getTags()", "setSMSNumber()", "setEmail()", "logoutSMSNumber()", "logoutEmail()", "syncHashedEmail()", "setExternalUserId()", "setLanguage()", "setSubscription()", "promptLocation()", "idsAvailable()", "sendTag()", "sendTags()", "setLocationShared()", "setDisableGMSMissingPrompt()", "setRequiresUserPrivacyConsent()", "unsubscribeWhenNotificationsAreDisabled()", "handleNotificationOpen()", "onAppLostFocus()", "sendOutcome()", "sendUniqueOutcome()", "sendOutcomeWithValue()", "removeGroupedNotifications()", "removeNotification()", "clearOneSignalNotifications()"));

    /* renamed from: e, reason: collision with root package name */
    private final j2 f22471e;

    u2(j2 j2Var, r1 r1Var) {
        super(r1Var);
        this.f22471e = j2Var;
    }

    boolean g(String str) {
        return !this.f22471e.k() && f22470f.contains(str);
    }
}
