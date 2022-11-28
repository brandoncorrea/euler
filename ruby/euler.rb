problem_number = ARGV[0]
problem_number_padded = problem_number.rjust(3, '0')

def ensure_directory(path)
  Dir.mkdir(path) unless Dir.exist?(path)
end

ensure_directory('lib')
ensure_directory('spec')

lib_file = "lib/problem#{problem_number_padded}.rb"
File.open(lib_file, 'w') unless File.exist?(lib_file)

spec_file = "spec/problem#{problem_number_padded}_spec.rb"
unless File.exist?(spec_file)
  File.open(spec_file, 'w') do |file|
    file.write(
"require 'problem#{problem_number_padded}'

# http://projecteuler.net/index.php?section=problems&id=#{problem_number}

describe \"Euler Problem ##{problem_number}\" do
  it \"Solves #1\" do
    expect(1).to eq 2
  end
end
")
  end
end
