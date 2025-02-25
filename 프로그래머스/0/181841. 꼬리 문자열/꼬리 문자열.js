function solution(str_list, ex) {
    var answer = '';
    
    for(var str of str_list){
        if(!str.includes(ex)){
            answer += str;
        }
    }
    
    return answer;
}