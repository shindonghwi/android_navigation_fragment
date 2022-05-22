package wolf.shin.navigationfragment.wolf.base

import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel() {
    public override fun onCleared() {
        super.onCleared()
        /** TODO: Inside onCleared, it defines the actions to be taken when the view model disappears */
    }
}