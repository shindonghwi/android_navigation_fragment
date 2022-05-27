package wolf.shin.navigationfragment.wolf.presentation.screen2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import wolf.shin.navigationfragment.databinding.FragmentSecondBinding
import wolf.shin.navigationfragment.wolf.base.BaseFragment

class SecondFragment : BaseFragment<FragmentSecondBinding, SecondViewModel>() {
    override val viewModel: SecondViewModel get() = ViewModelProvider(this)[SecondViewModel::class.java]

    override fun getFragmentBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentSecondBinding {
        return FragmentSecondBinding.inflate(layoutInflater)
    }

    override fun initView() {}
}