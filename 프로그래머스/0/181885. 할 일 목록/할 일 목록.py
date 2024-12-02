def solution(todo_list, finished):

    return [todo for todo, finish in zip(todo_list, finished) if not finish]