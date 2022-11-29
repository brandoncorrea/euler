def ensure_directory(path)
  Dir.mkdir(path) unless Dir.exist?(path)
end

def pad_3(n) n.rjust(3, '0') end

def create_lib_file(problem_number)
  lib_file = "lib/problem#{pad_3(problem_number)}.rb"
  unless File.exist?(lib_file)
    File.open(lib_file, 'w') do |file|
      file.write("def euler_#{problem_number}(n)\n  \nend\n")
    end
  end
end

def create_spec_file(problem_number)
  problem_number_padded = pad_3(problem_number)
  spec_file = "spec/problem#{problem_number_padded}_spec.rb"
  unless File.exist?(spec_file)
    File.open(spec_file, 'w') do |file|
      file.write(
        "require 'problem#{problem_number_padded}'

# https://projecteuler.net/index.php?section=problems&id=#{problem_number}

describe \"Euler Problem ##{problem_number}\" do
  it \"Solves #1\" do
    expect(euler_#{problem_number}(1)).to eq 1
  end
end
")
    end
  end
end

problem_number = ARGV[0]
ensure_directory('lib')
ensure_directory('spec')
create_lib_file(problem_number)
create_spec_file(problem_number)
