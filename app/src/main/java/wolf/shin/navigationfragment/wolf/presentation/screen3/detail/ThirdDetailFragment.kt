package wolf.shin.navigationfragment.wolf.presentation.screen3.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import wolf.shin.navigationfragment.databinding.FragmentThirdDetailBinding
import wolf.shin.navigationfragment.wolf.base.BaseFragment

class ThirdDetailFragment : BaseFragment<FragmentThirdDetailBinding, ThirdDetailViewModel>() {
    override val viewModel: ThirdDetailViewModel get() = ViewModelProvider(this)[ThirdDetailViewModel::class.java]

    override fun getFragmentBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentThirdDetailBinding {
        return FragmentThirdDetailBinding.inflate(layoutInflater)
    }

    override fun initView() {}
}