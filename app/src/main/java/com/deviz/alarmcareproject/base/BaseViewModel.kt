package com.deviz.alarmcareproject.base

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

//1. 생명주기 독립적인 컨텍스트 필요: Application 컨텍스트는 애플리케이션의 전체 생명주기 동안 유효하므로, 액티비티나 서비스의 생명주기와 독립적으로 동작해야 하는 컴포넌트에서 사용됩니다.
//2. 앱 초기화 작업: 외부 라이브러리나 서비스의 초기화 작업을 수행하는 경우 Application 객체를 사용하곤 합니다. 예를 들어, Firebase, Google Analytics와 같은 서비스를 사용할 때 이들 서비스의 초기화 코드를 Application 클래스에서 수행합니다.
//3. 글로벌 상태 관리: 로그인 정보, 유저 세팅 등의 애플리케이션 전체에서 공유되는 상태를 관리하는 데 사용됩니다.
//4. 공유 리소스 관리: 데이터베이스 연결, 네트워크 클라이언트 등의 애플리케이션 전체에서 공유되는 리소스를 관리하는 데 사용됩니다.

@HiltViewModel
open class BaseViewModel @Inject constructor(application: Application) : AndroidViewModel(application) {
    private val TAG = "BaseViewModel"


}