package com.preference.ui.debug;

import android.os.Bundle;
import android.view.MenuItem;

import com.preference.model.PreferenceItem;

import java.util.List;

/**
 * Created by Ali Asadi on 10/10/2018.
 */
public interface DebugContract {

    interface View {
        void updateView(List<DebugAdapter.PreferenceGroup> list, boolean editable);

        void showEditValueDialog(PreferenceItem item);

        void refreshView();

        void onExpandClicked(MenuItem item);

        void onCollapseClicked(MenuItem item);

        void onBackButtonClicked();
    }

    interface Presenter {

        void getExtras(Bundle extras);

        void getData();

        void onBooleanPreferenceClicked(PreferenceItem item, boolean isChecked);

        void onDefaultPreferenceClicked(PreferenceItem item);

        void onSavePreferenceClicked(PreferenceItem item, String newValue) throws NumberFormatException;

        void onExpandClicked(MenuItem item);

        void onCollapseClicked(MenuItem item);

        void onBackButtonClicked();
    }


}
