package com.AiNotes.app.view.pflockscreen.security.callbacks;

import com.AiNotes.app.view.pflockscreen.security.PFResult;

public interface PFPinCodeHelperCallback<T> {
    void onResult(PFResult<T> result);
}
