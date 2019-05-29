# Employee info
class Employee
  attr_accessor :id, :importance, :subordinates
  def initialize( id, importance, subordinates)
    # It's the unique id of each node.
    # unique id of this employee
    @id = id
    # the importance value of this employee
    @importance = importance
    # the id of direct subordinates
    @subordinates = subordinates
  end
end

# @param {Employee} employees
# @param {Integer} id
# @return {Integer}
def get_importance(employees, id)

  emap = {}
  employees.each do |e|
    emap[e.id] = e
  end
  dfs(emap, id)
end

def dfs(emap, eid)
  emp = emap[eid]
  subs = emp.subordinates.map{|eid| dfs(emap, eid)}.reduce(0, :+)
  x = emp.importance + subs
  x
end

emps1 = [
  Employee.new(1, 5, [2,3]),
  Employee.new(2, 3, []),
  Employee.new(3, 3, []),
]
puts get_importance(emps1, 1) == 11

emps2 = [
  Employee.new(1, 5, []),
  Employee.new(2, 3, []),
  Employee.new(3, 3, []),
]
puts get_importance(emps2, 1) == 5

emps3 = [
  Employee.new(1, 5, [4]),
  Employee.new(2, 3, []),
  Employee.new(3, 3, [2]),
  Employee.new(4, 5, [3]),
]
puts get_importance(emps3, 1) == 16
