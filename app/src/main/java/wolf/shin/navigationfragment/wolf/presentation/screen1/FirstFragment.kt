package wolf.shin.navigationfragment.wolf.presentation.screen1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import wolf.shin.navigationfragment.databinding.FragmentFirstBinding
import wolf.shin.navigationfragment.wolf.base.BaseFragment

class FirstFragment : BaseFragment<FragmentFirstBinding, FirstViewModel>() {
    override val viewModel: FirstViewModel get() = ViewModelProvider(this)[FirstViewModel::class.java]

    override fun getFragmentBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentFirstBinding {
        return FragmentFirstBinding.inflate(layoutInflater)
    }

    override fun initView() {}
}